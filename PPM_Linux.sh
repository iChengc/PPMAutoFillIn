work_dir=$(pwd)
script_dir=$(cd "$(dirname "$0")"; pwd)

# you should change it to your user name and password
username="Your_User_Name"
password="Your_Password"
echo "username=\"$username\"" > $script_dir/bin/config.sh
echo "password=\"$password\"" >> $script_dir/bin/config.sh

# make sure the work directory is in where the script is.
cd $script_dir

rm -f -r -d ./bin/ppmAuto_lib
mkdir ./bin/ppmAuto_lib
cp ./source/libs/* ./bin/ppmAuto_lib

sudo chmod 777 $script_dir/bin/run.sh
source $script_dir/bin/scheduled.sh
