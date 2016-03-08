work_dir=$(pwd)
script_dir=$(cd "$(dirname "$0")"; pwd)
source ${script_dir}/config.sh
ppm_jar=ppmauto.jar
java -jar $script_dir/ppmAuto.jar $username $password
