services:
  bader-homepage:
    build:
      context: .  # Dies ist das Verzeichnis, in dem sich die Dockerfile befinden sollte
      dockerfile: Dockerfile  # Name der Dockerfile (normalerweise 'Dockerfile', kannst du anpassen)
    environment:
      - JAR_FILE=BaderHomepage-0.0.1-SNAPSHOT.jar  # Setzt den JAR_FILE-ARG
    ports:
      - "8080:8080"  # Portweiterleitung (anpassen, falls nötig)
    command: ["java", "-jar", "/BaderHomepage-0.0.1-SNAPSHOT.jar"]  # Start-Befehl

