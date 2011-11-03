#!/bin/bash
#
# This script is specific for the current project; your user's .bashrc must be configured accordingly,
# reporting the following syntax:
#
# for prjfolder in ~/prj/*; do
#   if [ -r $prjfolder/bashrc ]; then
#     echo "Executing $prjfolder/bashrc"
#     . $prjfolder/bashrc
#   elif [ -r $prjfolder/code/bashrc ]; then
#     echo "Executing $prjfolder/code/bashrc"
#     . $prjfolder/code/bashrc
#   fi
# done

export PATH=$PATH:~/prj/opt/leiningen
