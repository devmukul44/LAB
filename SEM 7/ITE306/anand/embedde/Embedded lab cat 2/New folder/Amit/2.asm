mov scon, #050h
mov tmod, #020h
mov th1, #0feh
setb tr1
again:
mov sbuf, #'h'
acall loop
mov sbuf, #'e'
acall loop
mov sbuf, #'l'
acall loop
sjmp again
loop: jnb ti, loop
clr ti
ret
end
