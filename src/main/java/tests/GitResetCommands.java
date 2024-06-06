package tests;

public class GitResetCommands {
	
	/*
	 * 1. reset all files from staging area 
	 * git reset (muta toate fisierele din staging inapoi in working directory)
	 * 
	 * 2. reset single file from staging area
	 * git reset filename (git reset src/main/java/tests/GitResetCommands.java) --> muta un singur fisier din staging inapoi in working dir
	 * 
	 * 3. reset a commit
	 * git reset HEAD^
	 * 
	 * 4. reset multiple commits
	 * git resert HEAD^~3  (3 -> nr de commituri pe care vreau sa le sterg)
	 * 
	 * 
	 * --> git reset flags
	 * git reset --soft (sterge commitul din istoric si muta fisierele in staging area)
	 * git reset --soft HEAD^
	 * 
	 * git reset --mixed (sterge commitul din istoric si muta fisierele in working dir)
	 * 
	 * git reset --hard (sterge commitul din istoric si fisierele)
	 * 
	 * 
	 * 5. delete a commit from remote repo
	 * 
	 * a> delete commit from local
	 * git reset HEAD^
	 * 
	 * b> push the change to remote which will delete the commit also from remote
	 * git push origin +HEAD
	 * 
	 * 6. delete commit from remote only (keep on local)
	 * git push origin +HEAD^:master
	 * 
	 * 
	 */

}
