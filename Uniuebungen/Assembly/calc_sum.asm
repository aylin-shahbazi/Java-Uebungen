calc_sum:
    mov rax, 0
    mov rcx, 1

loop:
    add rax, rcx
    inc rcx
    cmp rcx, 10
    jle loop