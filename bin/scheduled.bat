rem at 17:00 /every:F %cd%\Run.bat
rem at 17:41 /every:M "C:\Program Files (x86)\Evernote\Evernote\Evernote.exe"
echo %cd%
schtasks /create /tn "PPMAuto" /tr %cd%\bin\run.bat /sc weekly /d TUE /st 13:36 /F