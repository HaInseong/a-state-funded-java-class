package day14;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class StepDTO implements Serializable{ //DTO가 붙어있으면 여러 객체를 담아서 전달하는 역할
//	private static final long serialVersionUID = -9060430121447664088L; serialVersionUID 없으면 기본값 -1을 자동으로 사용함
//	Serializable 구현한 클래스는 serialVersionUID 정의하지 않으면 경고가 뜨게 되어있지만,ㅡPrefereneces에서 적용되지 않게 ignore 설정함. 
	
	
	//non-static 멤버변수를 저장해뒀다가 다시 읽어올 수 있게 만드는게 객체 직렬화.
	//객체직렬화는 접근제어자가 무엇이든 상관없다.
	private String stepId;
	transient private String password; //중요해서 객체 직렬화시 제외시키고 싶음. = transient, 제외시킨 걸 다시 읽어들일 때는 기본값으로 읽어들임 = 0
	private int age;
	transient private int score;
	public StepDTO(String stepId, String password, int age, int score) {
		super();
		this.stepId = stepId;
		this.password = password;
		this.age = age;
		this.score = score;
	}
	public String getStepId() {
		return stepId;
	}
	public void setStepId(String stepId) {
		this.stepId = stepId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}

public class SerialTest5 {
   public static void main(String[] args) throws Exception{ 
      FileOutputStream fos = 
    		  new FileOutputStream("c:/iotest/test3.ser"); 
      ObjectOutputStream oos = 
    		  new ObjectOutputStream(fos);
      
      StepDTO dto  = new StepDTO("unico", "@12345", 33, 100);
      oos.writeObject(dto);
      oos.close();
      fos.close();
      System.out.println("직렬화 출력 완료");      
   }
}



