cd ..

BRANCH=`git branch|grep \*`

echo Branches available
git branch -a

echo Do you wish to pull project?
read answer

if [ "$answer" = "yes" ]; then
    #git pull
    git pull origin ${BRANCH:2}
fi

echo do you wish to commit project?
read answer

if [ "$answer" = "yes" ]; then
    echo using branch ${BRANCH:2}
    
    echo enter you comment for this revision
    read comment
    
    echo git add -A
    git add -A
    
    echo git commit -m \"$comment\"
    git commit -m "$comment"
    
    echo git push origin ${BRANCH:2}
    git push origin ${BRANCH:2}
fi