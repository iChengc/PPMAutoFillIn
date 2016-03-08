work_dir=$(pwd)
script_dir=$(cd "$(dirname "$0")"; pwd)

# you should change it to your user name and password
username="chengcn"
password="abc1234_"
echo "username=\"$username\"" > $script_dir/bin/config.sh
echo "password=\"$password\"" >> $script_dir/bin/config.sh

# make sure the work directory is in where the script is.
cd $script_dir
work_dir=$(pwd)
source ${work_dir}/bin/scheduled.sh
