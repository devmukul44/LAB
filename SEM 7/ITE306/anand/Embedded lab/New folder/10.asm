mov scon,#050h
mov tmod,#020h
mov th1,#0feh
setb tr1
again:
mov sbuf,#'S'
acall loop
mov sbuf,#'h'
acall loop
mov sbuf,#'i'
acall loop
mov sbuf,#'v'
acall loop
mov sbuf,#'a'
acall loop
mov sbuf,#'m'
acall loop
sjmp again
loop: jnb ti,loop
clr ti
ret
end
