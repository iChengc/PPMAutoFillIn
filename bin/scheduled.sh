
#echo "13 22 * * 1 ${script_dir}/Run.sh">>/etc/crontab 
#!/bin/sh
script_dir=$(cd "$(dirname "$0")"; pwd)
echo $script_dir
PROGRAM=$script_dir/Run.sh
CRONTAB_CMD="15 23 * * * sh $PROGRAM > /dev/null 2>&1 &"
(crontab -l 2>/dev/null | grep -Fv $PROGRAM; echo "$CRONTAB_CMD") | crontab -
COUNT=`crontab -l | grep $PROGRAM | grep -v "grep"|wc -l `
if [ $COUNT -lt 1 ]; then
        echo "fail to add crontab $PROGRAM"
        exit 1
fi 


work_dir=$(pwd)
script_dir=$(cd "$(dirname "$0")"; pwd)
source ${script_dir}/SetUserNamePassword.sh
ppm_jar=ppmauto.jar
java -jar $script_dir/ppmAuto.jar $username $password
