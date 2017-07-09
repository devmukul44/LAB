mov scon, #050h
mov tmod, #020h
mov th1, #0feh
setb tr1
again:
mov a,sbuf
mov p3,a
mov sbuf, a 
loop: jnb ri, loop
clr ri
sjmp again
end
