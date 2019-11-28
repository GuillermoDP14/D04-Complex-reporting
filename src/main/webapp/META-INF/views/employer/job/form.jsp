<%-- form.jsp --%>

<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form readonly="true">

	<acme:form-textbox code="employer.job.form.label.reference" path="reference"/>
	<acme:form-textbox code="employer.job.form.label.title" path="title"/>
	<acme:form-moment code="employer.job.form.label.deadline" path="deadline"/>
	<acme:form-money code="employer.job.form.label.salary" path="salary" />
	<acme:form-url code="employer.job.form.label.moreInfo" path="moreInfo"/>
	<acme:form-textarea code="employer.job.form.label.description" path="descriptor.description"/>
	<acme:form-checkbox code="employer.job.form.label.finalMode" path="finalMode"/>
	
	<jstl:forEach var="duty" items="duties">
	<acme:form-textbox code="employer.job.form.label.duty.title" path="duty.title"/>
	<acme:form-textarea code="employer.job.form.label.duty.description" path="duty.description"/>
	<acme:form-textbox code="employer.job.form.label.duty.percentage" path="duty.percentage"/>
	</jstl:forEach>
	
	<acme:form-return code="employer.job.form.button.return"/>
</acme:form>