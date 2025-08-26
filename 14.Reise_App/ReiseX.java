package versuch6;

public class ReiseX extends Reise{
	private String veranstalter;
	
	public ReiseX(String startflughafen, String reiseziel, int reisedauer) {
		super(startflughafen, reiseziel, reisedauer);
		
	}

	public ReiseX(String startflughafen, String reiseziel) {
		super(startflughafen, reiseziel);
		
	}

	public String getVeranstalter() {
		return veranstalter;
	}

	public void setVeranstalter(String veranstalter) {
		this.veranstalter = veranstalter;
	}
	@Override
	protected boolean istKurzurlaub() {
		if(super.getReisedauer()<5) {
			return true;
		}
		return false;
	}

}
