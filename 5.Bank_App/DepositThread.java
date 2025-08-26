package uebung9;

public class DepositThread extends Thread{
	private Konto konto;
	private double betrag;
	public DepositThread(Konto konto, double betrag) {
		super();
		this.konto = konto;
		this.betrag = betrag;
	}
	public Konto getKonto() {
		return konto;
	}
	public void setKonto(Konto konto) {
		this.konto = konto;
	}
	public double getBetrag() {
		return betrag;
	}
	public void setBetrag(double betrag) {
		this.betrag = betrag;
	}
	
	@Override
	public void run() {
		while(true) {
			synchronized (konto) {
				while(konto.getKontostand()>=1200) {
					try {
						konto.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				konto.buchen(betrag);
				konto.notifyAll();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				
			}
		}
	}
	

}
