package io.adev.itschool.robot.levels

import io.adev.itschool.robot.common.arena.entity.arena.parseArena

@Suppress("SpellCheckingInspection")
val demoArena = parseArena("""
ppppp
pr  p
ppptp
ppppp
""".trim())

@Suppress("SpellCheckingInspection")
val arena1 = parseArena("""
ppppppppp
ppp   ppp
ppp p ppp
p   p   p
p ppppp p
p     ptp
ppp p ppp
ppp p ppp
ppr p  pp
""".trim())

@Suppress("SpellCheckingInspection")
val arena2 = parseArena("""
pppppppppp
r        p
pppppp ppp
p   p  ppp
p p   pppp
p  pppp tp
pp       p
pppppppppp
""".trim())

@Suppress("SpellCheckingInspection")
val homework1DenisArena = parseArena("""
ppppppppp
ppp   ppp
ppp p ppp
p   p   p
p ppppp p
p     ptp
ppp p ppp
ppp p ppp
ppr p  pp
""".trim())

@Suppress("SpellCheckingInspection")
val homework1EdwardArena = parseArena("""
pppppppppppppppppp
ppppp        ppppp
pppp         ppppp
p    ppppppp  pppp
p    p     p  pppp
ppr ppppppp tppppp
""".trim())

@Suppress("SpellCheckingInspection")
val arena3 = parseArena("""
ppppp
pr *p
ppptp
ppppp
""".trim())

@Suppress("SpellCheckingInspection")
val arena4 = parseArena("""
pppppppppp
r        p
pppppp*ppp
p   p  ppp
p*p   pppp
p  pppp tp
pp   *   p
pppppppppp
""".trim())

@Suppress("SpellCheckingInspection")
val arena5 = parseArena("""
ppppp
pr #p
ppptp
ppppp
""".trim())

@Suppress("SpellCheckingInspection")
val arena6 = parseArena("""
pppppppppp
r        p
pppppp#ppp
p   p  ppp
p#p   pppp
p  pppp tp
pp   #   p
pppppppppp
""".trim())

val homework3DenisArena = parseArena("""
     pppppppppppppppppppp
     p        p  p#       p
     p   p         pp p   p pp
pppppp       p    p  ppppppp  p
p    p            p           p
 ppppp     p   p #   #     #   p
     p#pp#   p   p       p   # p
   pppr   p       p  ppppppp#tp
  p   pppppppppppp ppppppppppp
  pppp  pppp      pppp  pppp
""".trimIndent())

val homework3EduardArena = parseArena("""
pppp
  rpp
     p
      p
      p
       p
       ppp
 p###pp   p
 p    p    p
p      p p p
p      p   p
p  p   pppp
 p    #    p
  pppp     p
     p  pppp
     pp#    p
    p        p
   p         p
  p           p
 p p         p
 p p#####pppp
 p       p
  p    tp
""".trimIndent())

val arena7 = parseArena("""
ppppppppppp
ptppppppprp
p  ppppp  p
pp  ppp  pp
ppp  p  ppp
p    p  c p
p ppppppp p
p#ppppppp p
p pppppppvp
pv #  c   p
pp ppppp pp
ppppppppppp
""".trimIndent())

val homework4EduardArena = parseArena("""
 ppppppppppp
p    t     p
pppppp     p         ppppppppppp
     p     p        p           p
     p#####p    pppp             p
     p     #pppp                  ppp
     p     # p                       pp
     p     # p                        pp
      pppppp v    c                   pp
           pppp ppp                 pp p
              p p pppppppppppvpppppp   p
             p p  p p       p p    p   p
             p p   p p      p p  p p   p
            p p    p p     p  p  p  p     
            p p    p p    p  c    prp
           ppp      ppp   ppp     ppp
           ppp      ppp   ppp     ppp
""".trimIndent())

val homework4DenisArena = parseArena("""
             ppppppppppp
   ppppp pppp           pppppp
 pp   vtpp  #                ppppp
pp     vp p  #                   pp
 pp    ppp   #                    pp
  p       pp #         p    ppppp p p
  pp    pp#  #        p     v    p  pp
    p  c   ppp p     p    pppp  cp  pp
     ppp   p  p  p  p ppppp p pp p
       pppp    p  p  p    p p  prp
                pp pp     pp   pp
               pppppp    ppp  ppp
""".trimIndent())