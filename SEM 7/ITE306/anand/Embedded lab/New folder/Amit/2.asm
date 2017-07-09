mov scon, #050h
mov tmod, #020h
mov th1, #0feh
mov r0,#05h
setb tr1
again:
mov sbuf, #'h'
acall loop
mov sbuf, #'e'
acall loop
mov sbuf, #'l'
acall loop
dnz r0,again
loop: jnb ti, loop
clr ti
ret
end
