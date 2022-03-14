class Project{
	String projectId;
	String projectName;
	String projectHead;
	int noOfResources;
	
	public String getprojectId(){
		return projectId;
	}
	public void setprojectId(String projectId) {
		this.projectId=projectId;
	}
	public String getprojectName(){
		return projectName;
	}
	public void setprojectName(String projectName) {
		this.projectName=projectName;
	}
	public String getprojectHead(){
		return projectId;
	}
	public void setprojectHead(String projectHead) {
		this.projectHead=projectHead;
	}
	public int getnoOfResources(){
		return noOfResources;
	}
	public void setnoOfResources(int noOfResources) {
		this.noOfResources=noOfResources;
	}
}
public class Projdescription {

	public static void main(String[] args) {
		Project pt=new Project();
		pt.setprojectId("D2K");
		pt.setprojectHead("Harsha");
		pt.setprojectName("Core Java");
		pt.setnoOfResources(20);;
		System.out.println("Project Id is "+pt.getprojectId());
		System.out.println("Project Head is "+pt.getprojectHead());
		System.out.println("Project Name is "+pt.getprojectName());
		System.out.println("Noofresources for project is "+pt.getnoOfResources());
	}

}
