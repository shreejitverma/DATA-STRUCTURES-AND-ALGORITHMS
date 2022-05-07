# python3
import sys


def build_suffix_tree(text):
  """
  Build a suffix tree of the string text and return a list
  with all of the labels of its edges (the corresponding 
  substrings of the text) in any order.
  """
  # Implement this function yourself
  return []


if __name__ == '__main__':
  text = sys.stdin.readline().strip()
  result = build_suffix_tree(text)
  print("\n".join(result))