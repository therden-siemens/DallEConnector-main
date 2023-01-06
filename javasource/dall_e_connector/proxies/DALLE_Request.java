// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package dall_e_connector.proxies;

public class DALLE_Request
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject dALLE_RequestMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DALL_E_Connector.DALLE_Request";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Prompt("Prompt"),
		N("N"),
		Size("Size"),
		DALLE_Request_DALLE_Response("DALL_E_Connector.DALLE_Request_DALLE_Response");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public DALLE_Request(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected DALLE_Request(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject dALLE_RequestMendixObject)
	{
		if (dALLE_RequestMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, dALLE_RequestMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.dALLE_RequestMendixObject = dALLE_RequestMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'DALLE_Request.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static dall_e_connector.proxies.DALLE_Request initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return dall_e_connector.proxies.DALLE_Request.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static dall_e_connector.proxies.DALLE_Request initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new dall_e_connector.proxies.DALLE_Request(context, mendixObject);
	}

	public static dall_e_connector.proxies.DALLE_Request load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return dall_e_connector.proxies.DALLE_Request.initialize(context, mendixObject);
	}

	public static java.util.List<dall_e_connector.proxies.DALLE_Request> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> dall_e_connector.proxies.DALLE_Request.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * Commit the changes made on this proxy object.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Prompt
	 */
	public final java.lang.String getPrompt()
	{
		return getPrompt(getContext());
	}

	/**
	 * @param context
	 * @return value of Prompt
	 */
	public final java.lang.String getPrompt(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Prompt.toString());
	}

	/**
	 * Set value of Prompt
	 * @param prompt
	 */
	public final void setPrompt(java.lang.String prompt)
	{
		setPrompt(getContext(), prompt);
	}

	/**
	 * Set value of Prompt
	 * @param context
	 * @param prompt
	 */
	public final void setPrompt(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String prompt)
	{
		getMendixObject().setValue(context, MemberNames.Prompt.toString(), prompt);
	}

	/**
	 * @return value of N
	 */
	public final java.lang.Integer getN()
	{
		return getN(getContext());
	}

	/**
	 * @param context
	 * @return value of N
	 */
	public final java.lang.Integer getN(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.N.toString());
	}

	/**
	 * Set value of N
	 * @param n
	 */
	public final void setN(java.lang.Integer n)
	{
		setN(getContext(), n);
	}

	/**
	 * Set value of N
	 * @param context
	 * @param n
	 */
	public final void setN(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer n)
	{
		getMendixObject().setValue(context, MemberNames.N.toString(), n);
	}

	/**
	 * Set value of Size
	 * @param size
	 */
	public final dall_e_connector.proxies.ENUM_Sizes getSize()
	{
		return getSize(getContext());
	}

	/**
	 * @param context
	 * @return value of Size
	 */
	public final dall_e_connector.proxies.ENUM_Sizes getSize(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Size.toString());
		if (obj == null) {
			return null;
		}
		return dall_e_connector.proxies.ENUM_Sizes.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Size
	 * @param size
	 */
	public final void setSize(dall_e_connector.proxies.ENUM_Sizes size)
	{
		setSize(getContext(), size);
	}

	/**
	 * Set value of Size
	 * @param context
	 * @param size
	 */
	public final void setSize(com.mendix.systemwideinterfaces.core.IContext context, dall_e_connector.proxies.ENUM_Sizes size)
	{
		if (size != null) {
			getMendixObject().setValue(context, MemberNames.Size.toString(), size.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.Size.toString(), null);
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of DALLE_Request_DALLE_Response
	 */
	public final dall_e_connector.proxies.DALLE_Response getDALLE_Request_DALLE_Response() throws com.mendix.core.CoreException
	{
		return getDALLE_Request_DALLE_Response(getContext());
	}

	/**
	 * @param context
	 * @return value of DALLE_Request_DALLE_Response
	 * @throws com.mendix.core.CoreException
	 */
	public final dall_e_connector.proxies.DALLE_Response getDALLE_Request_DALLE_Response(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		dall_e_connector.proxies.DALLE_Response result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DALLE_Request_DALLE_Response.toString());
		if (identifier != null) {
			result = dall_e_connector.proxies.DALLE_Response.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of DALLE_Request_DALLE_Response
	 * @param dalle_request_dalle_response
	 */
	public final void setDALLE_Request_DALLE_Response(dall_e_connector.proxies.DALLE_Response dalle_request_dalle_response)
	{
		setDALLE_Request_DALLE_Response(getContext(), dalle_request_dalle_response);
	}

	/**
	 * Set value of DALLE_Request_DALLE_Response
	 * @param context
	 * @param dalle_request_dalle_response
	 */
	public final void setDALLE_Request_DALLE_Response(com.mendix.systemwideinterfaces.core.IContext context, dall_e_connector.proxies.DALLE_Response dalle_request_dalle_response)
	{
		if (dalle_request_dalle_response == null) {
			getMendixObject().setValue(context, MemberNames.DALLE_Request_DALLE_Response.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.DALLE_Request_DALLE_Response.toString(), dalle_request_dalle_response.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return dALLE_RequestMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final dall_e_connector.proxies.DALLE_Request that = (dall_e_connector.proxies.DALLE_Request) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return entityName;
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}