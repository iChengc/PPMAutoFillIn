#!/bin/bash
#echo "13 22 * * 1 ${script_dir}/Run.sh">>/etc/crontab
#!/bin/sh
script_dir=$(cd "$(dirname "$0")"; pwd)
PROGRAM=$script_dir/bin/run.sh

#CRONTAB_CMD="15 23 * * */2 sh $PROGRAM > /dev/null 2>&1 &"
#(sudo crontab -l 2>/dev/null | grep -Fv $PROGRAM; echo "$CRONTAB_CMD") | crontab -
#COUNT=`crontab -l | grep $PROGRAM | grep -v "grep"|wc -l `
#if [ $COUNT -lt 1 ]; then
#        echo "fail to add crontab $PROGRAM"
#        exit 1
#fi 

#write out current crontab
crontab -l > ppmAuto.cmd

#echo new cron into cron file
echo "00 17 * * */5 ${PROGRAM}" >> ppmAuto.cmd
#install new cron file
crontab ppmAuto.cmd
rm ppmAuto.cmd
