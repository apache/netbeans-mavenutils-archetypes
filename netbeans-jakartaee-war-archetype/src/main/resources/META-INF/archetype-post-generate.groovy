dir = new File(new File(request.outputDirectory), request.artifactId)

jakartaEEVariant = request.getProperties().get("jakartaEEVariant")

if ("jakartaee-core".equals(jakartaEEVariant)) {
    dir = new File(new File(request.outputDirectory), request.artifactId)
    persistenceXml = new File(dir.toString() + "/src/main/resources/META-INF/persistence.xml");

    persistenceXml.delete()
}