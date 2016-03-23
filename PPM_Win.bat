@echo off
COLOR 0A
setlocal enabledelayedexpansion

rem you should change it to your user name and password
set username=chengcn
set password=abc1234_

set work_dir=%cd%
set script_dir=%~dp0

rem make sure the work directory is in where the script is.
if not "%work_dir%"=="%script_dir%" cd /d "%script_dir%"

echo set username=%username%>bin\config.bat
echo set password=%password%>>bin\config.bat

rem copy the depency libs
DEL bin\ppmauto_lib\* /Q /F /S
xcopy source\libs\* bin\ppmauto_lib\ /F /S /E /Q

call bin\findJava\find_java.bat
call bin\scheduled.bat

@echo on
