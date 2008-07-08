<?xml version="1.0" encoding="UTF-8"?>
<!-- ===============================================================================================
	 XSLT for a web.xml Generation. This configuration file is targeted at the hosting
	 servlet engine for a generated Web Service.
 -->
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" omit-xml-declaration="no" indent="yes"/>
<xsl:template match="/"><xsl:apply-templates select="cixs-service"/></xsl:template>

<xsl:template match="cixs-service">
	<xsl:call-template name="generate-content"/>
</xsl:template>

<!-- ===============================================================================================
	 Generate the content of the web.xml file
 -->
<xsl:template name="generate-content">

	<!--  Provide default values for missing parameters -->
	<xsl:variable name="webapp-display-name">
		<xsl:choose>
			<xsl:when test="string-length(webapp-display-name) > 0"><xsl:value-of select="webapp-display-name"/></xsl:when>
			<xsl:otherwise>cixs.<xsl:value-of select="service-name"/></xsl:otherwise>
		</xsl:choose>
	</xsl:variable>
	<xsl:variable name="webapp-description">
		<xsl:choose>
			<xsl:when test="string-length(webapp-description) > 0"><xsl:value-of select="webapp-description"/></xsl:when>
			<xsl:otherwise>cixs <xsl:value-of select="service-name"/> Web Service</xsl:otherwise>
		</xsl:choose>
	</xsl:variable>
	<xsl:variable name="servlet-name">
		<xsl:choose>
			<xsl:when test="string-length(servlet-name) > 0"><xsl:value-of select="servlet-name"/></xsl:when>
			<xsl:otherwise><xsl:value-of select="service-name"/>WebService</xsl:otherwise>
		</xsl:choose>
	</xsl:variable>
	<xsl:variable name="servlet-display-name">
		<xsl:choose>
			<xsl:when test="string-length(servlet-display-name) > 0"><xsl:value-of select="servlet-display-name"/></xsl:when>
			<xsl:otherwise>cixs.<xsl:value-of select="service-name"/>WebService</xsl:otherwise>
		</xsl:choose>
	</xsl:variable>
	<xsl:variable name="servlet-description">
		<xsl:choose>
			<xsl:when test="string-length(servlet-description) > 0"><xsl:value-of select="servlet-description"/></xsl:when>
			<xsl:otherwise>JAX-WS endpoint - <xsl:value-of select="service-name"/> Web Service</xsl:otherwise>
		</xsl:choose>
	</xsl:variable>
	<xsl:variable name="servlet-url-pattern">
		<xsl:choose>
			<xsl:when test="string-length(servlet-url-pattern) > 0"><xsl:value-of select="servlet-url-pattern"/></xsl:when>
			<xsl:otherwise>/<xsl:value-of select="service-name"/></xsl:otherwise>
		</xsl:choose>
	</xsl:variable>
	
	<!--  Create content -->
	<xsl:element  name = "web-app">
		<xsl:element  name = "display-name"><xsl:value-of select="$webapp-display-name"/></xsl:element>
		<xsl:element  name = "description"><xsl:value-of select="$webapp-description"/></xsl:element>
		<xsl:element  name = "listener">
			<xsl:element  name = "listener-class">com.sun.xml.ws.transport.http.servlet.WSServletContextListener</xsl:element>
		</xsl:element>
		<xsl:element  name = "servlet">
			<xsl:element  name = "servlet-name"><xsl:value-of select="$servlet-name"/></xsl:element>
			<xsl:element  name = "display-name"><xsl:value-of select="$servlet-display-name"/></xsl:element>
			<xsl:element  name = "description"><xsl:value-of select="$servlet-description"/></xsl:element>
			<xsl:element  name = "servlet-class">com.sun.xml.ws.transport.http.servlet.WSServlet</xsl:element>
			<xsl:element  name = "load-on-startup">1</xsl:element>
		</xsl:element>
		<xsl:element  name = "servlet-mapping">
			<xsl:element  name = "servlet-name"><xsl:value-of select="$servlet-name"/></xsl:element>
			<xsl:element  name = "url-pattern"><xsl:value-of select="$servlet-url-pattern"/></xsl:element>
		</xsl:element>
		<xsl:element  name = "session-config">
			<xsl:element  name = "session-timeout">60</xsl:element>
		</xsl:element>
		<xsl:element  name = "env-entry">
			<xsl:element  name = "env-entry-name">legstar/configFileName</xsl:element>
			<xsl:element  name = "env-entry-value">config.xml</xsl:element>
			<xsl:element  name = "env-entry-type">java.lang.String</xsl:element>
		</xsl:element>
   </xsl:element>
   
</xsl:template>

</xsl:stylesheet>