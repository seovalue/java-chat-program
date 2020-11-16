## Class
* ChatServer  
클라이언트의 요청을 받아들이는 TCP  
* ChatServerProcessThread  
클라이언트로부터 요청이 오면 클라이언트와 통신을 하기 위해 서버에서 생성되는 쓰레드  
* ChatClientApp  
TCP 클라이언트 클래스  
* ChatWindow  
java.awt로 작성된 UI 화면 클래스  

## 과정
1. 서버와 클라이언트가 연결되면, 서버는 클라이언트가 메시지를 보낼 때까지 대기 상태  
2. 클라이언트가 메시지를 보내면(`write`) 서버는 이를 읽고(`read`), broadcast 방식으로 자신과 연결된 모든 클라이언트에게 메시지를 보낸다.  
--> 클라이언트는 메시지를 보내는 쓰레드와 더불어 broadcast를 수신하는 쓰레드가 있어야 이를 통해 서버로부터 메시지 수신 가능  

## 프로토콜
* join  
채팅 서버에 참여  
* message
메시지를 보냄  
* quit  
방을 나감  
