TABLE-INSERT.T; x/
1 if T:size == 0
2 allocate T:table with 1 slot
3 T:size D 1
4 if T:num == T:size
5 allocate new-table with 2  T:size slots
6 insert all items in T:table into new-table
7 free T:table
8 T:table D new-table
9 T:size D 2  T:size
10 insert x into T:table
11 T:num D T:num C 1
