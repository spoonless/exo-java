export JAVA_HOME=/opt/bin/jdk-11.0.4/

mvn clean org.jacoco:jacoco-maven-plugin:0.8.5:prepare-agent test org.jacoco:jacoco-maven-plugin:0.8.5:report

xdg-open target/site/jacoco/fr.epsi.b3.calculatrice/Calculatrice.java.html

