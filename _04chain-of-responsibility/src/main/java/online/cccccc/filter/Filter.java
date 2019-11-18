package online.cccccc.filter;

import online.cccccc.dto.Request;
import online.cccccc.dto.Response;

/**
 * @author 你是电脑
 * @create 2019/11/18 - 10:32
 */
public interface Filter {
    void doFilter(Request request, Response response,FilterChain chain);
}
