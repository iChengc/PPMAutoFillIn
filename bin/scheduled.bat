rem at 17:00 /every:F %cd%\Run.bat
rem at 17:41 /every:M "C:\Program Files (x86)\Evernote\Evernote\Evernote.exe"
rem echo %cd%
schtasks /create /tn "PPMAuto" /tr %cd%\bin\run.bat /sc weekly /d FRI /st 12:00 /F