package online.cccccc.filter;

import online.cccccc.dto.Request;
import online.cccccc.dto.Response;

/**
 * @author 你是电脑
 * @create 2019/11/18 - 10:50
 */
public abstract class BaseFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        if(doBefore(request,response)){
        chain.doFilter(request,response,chain);
        };
        doAfter(request,response);
    }

    public boolean doBefore(Request request, Response response) {
        return true;
    }

    public boolean doAfter(Request request, Response response) {
        return true;
    }

}
