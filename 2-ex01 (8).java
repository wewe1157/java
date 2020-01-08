package day02;
//http status code에 따른
//결과값 변경해주기

public class ex08 {
  public static void main(String[] args) {
	  
	  int statusCode = 200;
	  String response = "http://localhost:8080/main/";
			  
	  switch(statusCode){
		  case 100:
			  break;
		  case 200:
			  break;
		  case 300:
			  break;
		  case 400:
			  response = "http://localhost:8080/error/";
			  break;
		  case 404:
			  response = "http://localhost:8080/error/";
			  break;
		  default:
			  break;
	  }
	  System.out.println(response);
  }
  
}
