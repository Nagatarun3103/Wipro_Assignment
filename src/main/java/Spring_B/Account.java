package Spring_B;


public class Account {
    private String id;
    private String type;
    private String status;

    

   public Account(String id, String type, String status) {
		// TODO Auto-generated constructor stub
		this.id = id;
        this.type = type;
        this.status = status;
	}


	// Getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
