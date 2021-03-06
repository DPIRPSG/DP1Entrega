<%--
 * header.jsp
 *
 * Copyright (C) 2014 Universidad de Sevilla
 * 
 * The use of this project is hereby constrained to the conditions of the 
 * TDG Licence, a copy of which you may download from 
 * http://www.tdg-seville.info/License.html
 --%>

<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags"%>

<div>
	<img src="images/logo.png" alt="Getting-Started-Menu Co., Inc." />
</div>

<div>
	<ul id="bluemenu" class="bluemenu"> <!-- id="jMenu">-->
		<!-- Do not forget the "fNiv" class for the first level links !! -->
		<security:authorize access="hasRole('ADMIN')">
			<li class="middle first level-0"><a class="fNiv"><spring:message	code="master.page.administrator" /></a>
				<ul class="level-1">
					<li class="first level-1"><a href="administrator/action-1.do"><spring:message code="master.page.administrator.action.1" /></a></li>
					<li class="last level-1"><a href="administrator/action-2.do"><spring:message code="master.page.administrator.action.2" /></a></li>					
				</ul>
			</li>
		</security:authorize>
		
		<security:authorize access="hasRole('CUSTOMER')">
			<li class="middle level-0"><a class="fNiv"><spring:message	code="master.page.customer" /></a>
				<ul class="level-1">
					<li class="first level-1"><a href="customer/action-1.do"><spring:message code="master.page.customer.action.1" /></a></li>
					<li class="last level-1"><a href="customer/action-2.do"><spring:message code="master.page.customer.action.2" /></a></li>					
				</ul>
			</li>
		</security:authorize>
		
		<security:authorize access="isAnonymous()">
			<li class="last level-0"><a class="fNiv" href="security/login.do"><spring:message code="master.page.login" /></a></li>
		</security:authorize>
		
		<security:authorize access="isAuthenticated()">
			<li class="last level-0">
				<a class="fNiv"> 
					<spring:message code="master.page.profile" /> 
			        (<security:authentication property="principal.username" />)
				</a>
				<ul class="level-1">
					<li class="first level-1"><a href="profile/action-1.do"><spring:message code="master.page.profile.action.1" /></a></li>
					<li class="middle level-1"><a href="profile/action-2.do"><spring:message code="master.page.profile.action.2" /></a></li>
					<li class="middle level-1"><a href="profile/action-3.do"><spring:message code="master.page.profile.action.3" /></a></li>					
					<li class="last level-1"><a href="j_spring_security_logout"><spring:message code="master.page.logout" /> </a></li>
				</ul>
			</li>
		</security:authorize>
	</ul>
</div>

<div>
	<a href="?language=en">en</a> | <a href="?language=es">es</a>
</div>

