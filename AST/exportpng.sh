#! /bin/bash
echo "Conversion des AST.dot en images PNG ..."
dot -Tpng *.dot -O #> /dev/null
echo "Terminé."
