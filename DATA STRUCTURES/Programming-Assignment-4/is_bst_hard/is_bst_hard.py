#!/usr/bin/python3

import sys, threading

sys.setrecursionlimit(10**7) # max depth of recursion
threading.stack_size(2**25)  # new thread will get stack of such size

def IsBinarySearchTree(tree):
  # Implement correct algorithm here
  return True


def main():
  nodes = int(sys.stdin.readline().strip())
  tree = [
      list(map(int,
               sys.stdin.readline().strip().split())) for _ in range(nodes)
  ]
  if IsBinarySearchTree(tree):
    print("CORRECT")
  else:
    print("INCORRECT")

threading.Thread(target=main).start()
