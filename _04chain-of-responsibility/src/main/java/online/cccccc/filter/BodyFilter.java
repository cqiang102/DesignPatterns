package online.cccccc.filter;

import online.cccccc.dto.Request;
import online.cccccc.dto.Response;

/**
 * @author 你是电脑
 * @create 2019/11/18 - 11:06
 */
public class BodyFilter extends BaseFilter {
    @Override
    public boolean doBefore(Request request, Response response) {
        System.out.println("Body => before");
        return super.doBefore(request, response);
    }

    @Override
    public boolean doAfter(Request request, Response response) {
        System.out.println("Body => after");
        response.setBody(response.getBody().concat("[BodyFilter]"));
        return super.doAfter(request, response);
    }
}
