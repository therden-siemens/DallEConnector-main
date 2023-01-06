// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package dall_e_connector.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	/**
	 * @deprecated
	 * The default constructor of the Microflows class should not be used.
	 * Use the static microflow invocation methods instead.
	 */
	@java.lang.Deprecated(since = "9.12", forRemoval = true)
	public Microflows() {}

	// These are the microflows for the DALL_E_Connector module
	public static void aCT_MF_TestCreateImage(IContext context, dall_e_connector.proxies.DALLE_Request _dALLE_Request)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("DALLE_Request", _dALLE_Request == null ? null : _dALLE_Request.getMendixObject());
		Core.microflowCall("DALL_E_Connector.ACT_MF_TestCreateImage").withParams(params).execute(context);
	}
	public static java.lang.String cONVERT_EnumSizes(IContext context, dall_e_connector.proxies.ENUM_Sizes _size)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Size", _size == null ? null : _size.name());
		return (java.lang.String) Core.microflowCall("DALL_E_Connector.CONVERT_EnumSizes").withParams(params).execute(context);
	}
	/**
	 * Call this MF to let DALL-E create one or multiple (n) images in the defined dimension.
	 */
	public static dall_e_connector.proxies.DALLE_Response sUB_MF_CreateImage(IContext context, java.lang.String _apiKey, dall_e_connector.proxies.DALLE_Request _dALLE_Request)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ApiKey", _apiKey);
		params.put("DALLE_Request", _dALLE_Request == null ? null : _dALLE_Request.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("DALL_E_Connector.SUB_MF_CreateImage").withParams(params).execute(context);
		return result == null ? null : dall_e_connector.proxies.DALLE_Response.initialize(context, result);
	}
}