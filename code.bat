set projectLocation=C:\Workspace\Automation testing\Test_Ec\Frms
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml