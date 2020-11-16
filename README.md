# ChatProgram
Chatprogram using socket, multi-thread.  


## API
* ServerSocket  
서버 역할을 하는 소켓 객체  
클라이언트의 연결 요청을 기다리며 연결 요청에 대한 수락을 담당  

* Socket  
클라이언트와 서버 간의 통신을 직접 담당

* InetAddress  
IP주소를 표현할 때 사용하는 클래스  

* InetSocketAddress  
SocketAddress를 상속받은 클래스, 소켓의 IP 주소와 port번호를 알 수 있도록 구현한 클래스  
도메인 이름만으로 객체를 생성할 수 있다.  
(ServerSocket 객체의 `bind()`, Socket 객체의 `connect()` 메서드를 호출할 때 인자로 사용)  

* InputStream & OutputStream  
byte 데이터를 입출력하기 위한 IO 클래스  