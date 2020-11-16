set AXIS2_HOME=C:\DATOS\docencia\softcomu\2019\LABORATORIO\prac3\axis2-1.7.9
set ANT_HOME=C:\DATOS\docencia\softcomu\2019\LABORATORIO\prac3\apache-ant-1.10.6

rem SET PATH=%path%;%ANT_HOME%\bin

cd ../servidor

set _RUNANT="%ANT_HOME%\bin\ant.bat"
%_RUNANT% -f build.xml

cd ../bat

pause
