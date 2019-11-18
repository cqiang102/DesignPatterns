package online.cccccc.dto;

/**
 * @author 你是电脑
 * @create 2019/11/18 - 10:33
 */
public class Request {
    private String firstLine;
    private String header;
    private String body;

    @Override
    public String toString() {
        return "Request{" +
                "firstLine='" + firstLine + '\'' +
                ", header='" + header + '\'' +
                ", body='" + body + '\'' +
                '}';
    }

    public String getFirstLine() {
        return firstLine;
    }

    public void setFirstLine(String firstLine) {
        this.firstLine = firstLine;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
