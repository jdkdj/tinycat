import com.zxx.tinycat.core.http.request.HttpRequestHandler;

public class Test3 {
    public static void main(String[] args) {
        String payload = "POST /get/userId HTTP/1.1\n" +
                "User-Agent: Apifox/1.0.0 (https://apifox.com)\n" +
                "Content-Type: application/json\n" +
                "Accept: */*\n" +
                "Host: 127.0.0.1:8080\n" +
                "Accept-Encoding: gzip, deflate, br\n" +
                "Connection: keep-alive\n" +
                "Content-Length: 19\n" +
                "\n" +
                "{\n" +
                "    \"123\": true\n" +
                "}";
        HttpRequestHandler httpRequestHandler = new HttpRequestHandler();
        httpRequestHandler.addPayload(payload);
        System.out.println(httpRequestHandler.getHttpRequests().size());
        System.out.println(httpRequestHandler.getHttpRequests().toString());

    }
}
