mov scon, #050h
mov tmod, #020h
mov th1, #0feh
setb tr1
again:
mov sbuf, #'m'
loop: jnb ti, loop
clr ti
sjmp again
end