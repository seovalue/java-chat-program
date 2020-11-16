package test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args){
        final int SERVER_PORT = 8000;

        ServerSocket serverSocket = null;

        try{
            // 1. 서버 소켓 객체 생성
            serverSocket = new ServerSocket();

            // 2. 소켓을 호스트의 포트와 바인딩
            String localHostAddress = InetAddress.getLocalHost().getHostAddress();
            serverSocket.bind(new InetSocketAddress(localHostAddress, SERVER_PORT));
            System.out.println("[server] binding at address: " + localHostAddress + ", port: "+SERVER_PORT);

            // 3. 클라이언트로부터 연결 요청이 올 때 까지 대기
            //연결 요청이 오기 전까지 서버는 block 상태이며, TCP 연결 과정인 3-way handshake로 연결이 되면 통신을 위한 Socket 객체가 반환된다.
            Socket socket = serverSocket.accept();

            // 4. 연결 요청이 오면 연결이 되었다는 메시지 출력
            InetSocketAddress remoteSocketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
            String remoteHostName = remoteSocketAddress.getAddress().getHostAddress();
            int remoteHostPort = remoteSocketAddress.getPort();
            System.out.println("[server] connected at socket address: " + remoteHostName + ", port: "+remoteHostPort);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try{
                if(serverSocket != null && !serverSocket.isClosed()){
                    serverSocket.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
