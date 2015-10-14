package du.core.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.view.freemarker.FreeMarkerView;

/**
 * 重写{@link FreeMarkerView}，实现在view添加全局变量
 * 原来默认使用FreeMarkerView
 * 
 * @author DDQ
 *
 */
public class VarFreeMarkerView extends FreeMarkerView {

	@Override
	protected void exposeHelpers(Map<String, Object> model, HttpServletRequest request) throws Exception {
		super.exposeHelpers(model, request);
		
		model.put("contextPath", request.getContextPath());
	}
}
