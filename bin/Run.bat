@echo off
COLOR 0A
setlocal enabledelayedexpansion
set work_dir=%cd%
set script_dir=%~dp0

rem make sure the work directory is in where the script is.
if not "%work_dir%"=="%script_dir%" cd /d "%script_dir%"

set ppm_jar=ppmauto.jar

call findJava\find_java.bat
call SetUserNamePassword.bat
java -jar %ppm_jar% %username% %password%
@echo on
exit