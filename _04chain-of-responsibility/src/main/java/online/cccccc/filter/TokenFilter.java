package online.cccccc.filter;

import online.cccccc.dto.Request;
import online.cccccc.dto.Response;

/**
 * @author 你是电脑
 * @create 2019/11/18 - 10:44
 */
public class TokenFilter extends BaseFilter {

    @Override
    public boolean doBefore(Request request, Response response) {
        System.out.println("Token => before");
        return  (request.getHeader().contains("TOKEN"));
    }

    @Override
    public boolean doAfter(Request request, Response response) {
        System.out.println("Token => after");
        response.setBody(response.getBody().concat("[TokenFilter]"));
        return true;
    }
}
