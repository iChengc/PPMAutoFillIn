work_dir=$(pwd)
script_dir=$(cd "$(dirname "$0")"; pwd)


# make sure the work directory is in where the script is.
cd $script_dir
source $script_dir/config.sh
java -jar ./ppmAuto.jar $username $password