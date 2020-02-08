package setdemo;

public class Participant implements Comparable<Participant>{
	private String participantName;
	private String participantTalent;
	private Float participantScore;
	public String getParticipantName() {
		return participantName;
	}
	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}
	public String getParticipantTalent() {
		return participantTalent;
	}
	public void setParticipantTalent(String participantTalent) {
		this.participantTalent = participantTalent;
	}
	public Float getParticipantScore() {
		return participantScore;
	}
	public void setParticipantScore(Float participantScore) {
		this.participantScore = participantScore;
	}
	@Override
	public int compareTo(Participant o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
