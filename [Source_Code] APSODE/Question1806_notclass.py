from sys import maxsize, stdin

seq_length, target_partial_sum = list(map(int, stdin.readline().rstrip("\n").split()))
seq_list = list(map(int, stdin.readline().rstrip("\n").split()))

start_index, end_index = 0, 0
partial_sum = 0
max_index = seq_length - 1
minimum_partial_seq_length = maxsize

while True:
    if partial_sum >= target_partial_sum:
        minimum_partial_seq_length = min(minimum_partial_seq_length, end_index - start_index)
        partial_sum -= seq_list[start_index]
        start_index += 1
    elif end_index == max_index:
        break
    else:
        partial_sum += seq_list[end_index]
        end_index += 1

print(minimum_partial_seq_length if minimum_partial_seq_length != maxsize else 0)
