package online.cccccc;

import online.cccccc.dto.Request;
import online.cccccc.dto.Response;
import online.cccccc.filter.BodyFilter;
import online.cccccc.filter.FilterChain;
import online.cccccc.filter.TokenFilter;

/**
 * @author 你是电脑
 * @create 2019/11/18 - 10:29
 */
public class ChainOfResponsibilityMain {
    public static void main(String[] args) throws InterruptedException {
        Response response = new Response();
        response.setFirstLine("200");
        response.setHeader("Content-type:application/json");
        response.setBody("{\"test\":1234}");
        Request request = new Request();
        request.setFirstLine("GET /test HTTP/1.1");
        request.setHeader("TOKEN:123");
//        request.setHeader("Cookie:123");
        request.setBody("{\"msg\":pass}");

        FilterChain filterChain = new FilterChain();

        filterChain.add(new TokenFilter()).add(new BodyFilter());
        filterChain.doFilter(request,response,filterChain);

        System.out.println(request);
        System.out.println(response);


    }
}

