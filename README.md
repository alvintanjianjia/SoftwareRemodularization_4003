# Read me #


## 1. Introduction ##
This Big Code Analysis project on Software Remodularization contains the following features in the form of Jupyter Notebooks:
1. Automated GitHub source code downloads
2. Groud Truth extraction based on previous 10 iterations / versions
3. Software Feature extraction using Depends
4. MoJo (Move Join Operations) using Mojo 1.2.1
5. Final Reporting csv file generation

## 2. Set Up ##
1. At least version 12 jdk (jdk-12.0.2_windowsx64_bin.exe)


## 3. File naming ##
1. Filename should not contain underscore

## 4. Commands (Testing and Errors) ##

java -jar depends.jar java spark-master spark_results

java MoJo a.rsf b.rsf

git clone
git checkout

If error:

1. Filename too long (run as admin, git config --ssystem core.longpaths true)
