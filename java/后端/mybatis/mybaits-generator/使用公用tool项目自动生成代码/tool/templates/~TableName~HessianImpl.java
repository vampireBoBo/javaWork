~package~.hessian.~beanPath~.impl
-----------------head----------------------
package ~package~.hessian.~beanPath~.impl;

import javax.annotation.Resource;

import com.beijia.senator.hessian.impl.BaseHessianImpl;
import ~package~.hessian.~beanPath~.I~TableName~Hessian;
import ~package~.service.IBaseService;
import ~package~.service.~beanPath~.I~TableName~Service;
/**
 * 
 * CopyRright (c)2007-2013: 陕西北佳信息技术有限责任公司<br>
 * Project:BJERP<br>                                  
 * Class Type实现 <br>
 * Comments:~TableName~信息hession实现 <br>
 * JDK version:1.6<br>
 * Namespace:~package~.hessian.~beanPath~.impl<br>
 * extends：IBaseHessian<br>
 * implements：I~TableName~Hessian<br>
 *--------------------------------------------------------------<br>
 * V1.0 创建  ~creater~ ~dateNow~  新项目 <br>
 *--------------------------------------------------------------<br>
 */
public class ~TableName~HessianImpl extends BaseHessianImpl implements I~TableName~Hessian {

	private I~TableName~Service ~tableName~Service;

	public I~TableName~Service get~TableName~Service() {
		return ~tableName~Service;
	}
	@Resource
	public void set~TableName~Service(I~TableName~Service ~tableName~Service) {
		this.~tableName~Service = ~tableName~Service;
	}
	@Override
	public IBaseService getBaseService() {
		return get~TableName~Service();
	}
}
