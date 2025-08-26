package uebung9;

public class WithdrawThread extends Thread{
	private Konto konto ;
	private double abbuchung;
	public WithdrawThread(Konto konto, double abbuchung) {
		super();
		this.konto = konto;
		this.abbuchung = abbuchung;
	}
	public Konto getKonto() {
		return konto;
	}
	public void setKonto(Konto konto) {
		this.konto = konto;
	}
	public double getAbbuchung() {
		return abbuchung;
	}
	public void setAbbuchung(double abbuchung) {
		this.abbuchung = abbuchung;
	}
	@Override
	public void run() {
		while(true) {
			synchronized (konto) {
				while(konto.getKontostand()<abbuchung) {
					try {
						konto.wait();
						System.out.println("Kontostand ist niedrig!!");
						
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				konto.buchen(-abbuchung);
				konto.notifyAll();
				System.out.println(abbuchung+" wurde abegbucht ");
				
			}
		}
	}

}
